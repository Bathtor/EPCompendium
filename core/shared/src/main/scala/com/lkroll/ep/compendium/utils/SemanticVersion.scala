package com.lkroll.ep.compendium.utils

import util.Try

case class SemanticVersion(major: Int, minor: Int, patch: Int, snapshot: Boolean) extends Ordered[SemanticVersion] {
  /**
   * Per category version difference.
   *
   * Snapshot status is maintained if either version is a snapshot.
   */
  def -(other: SemanticVersion): SemanticVersion = {
    SemanticVersion(this.major - other.major, this.minor - other.minor, this.patch - other.patch, this.snapshot || other.snapshot)
  }
  def incMajor(): SemanticVersion = this.copy(major = this.major + 1, minor = 0, patch = 0);
  def incMinor(): SemanticVersion = this.copy(minor = this.minor + 1, patch = 0);
  def incPatch(): SemanticVersion = this.copy(patch = this.patch + 1);

  override def compare(that: SemanticVersion): Int = {
    // Yes yes, I know this is ugly as fuck...Too lazy to rewrite now
    if (this.major > that.major) {
      1
    } else if (this.major == that.major) {
      if (this.minor > that.minor) {
        1
      } else if (this.minor == that.minor) {
        if (this.patch > that.patch) {
          1
        } else if (this.patch == that.patch) {
          if (!this.snapshot && that.snapshot) {
            1
          } else if (this.snapshot == that.snapshot) {
            0
          } else {
            -1
          }
        } else {
          -1
        }
      } else {
        -1
      }
    } else {
      -1
    }
  }

  override def toString(): String = if (snapshot) s"$major.$minor.$patch=SNAPSHOT" else s"$major.$minor.$patch";
}

object SemanticVersion {
  val versionFormat = """(\d+)\.(\d+)\.(\d+)(-SNAPSHOT)?""".r;

  def fromString(s: String): Try[SemanticVersion] = {
    Try {
      s match {
        case versionFormat(majorS, minorS, patchS, snapS) => for {
          major <- Try(majorS.toInt);
          minor <- Try(minorS.toInt);
          patch <- Try(patchS.toInt);
          snap <- Try(if (snapS == null) false else true)
        } yield SemanticVersion(major, minor, patch, snap)
      }
    }.flatten
  }
}
