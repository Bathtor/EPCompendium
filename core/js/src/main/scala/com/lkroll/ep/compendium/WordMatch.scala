package com.lkroll.ep.compendium

import com.lkroll.ep.compendium.utils.EditDistance

case class WordMatch(word: String, relativeMatch: Float, relativeDistance: Float) extends Ordered[WordMatch] {
  override def compare(that: WordMatch): Int = {
    if (this.word == that.word) {
      return 0;
    } else {
      val matchDiff = this.relativeMatch - that.relativeMatch;
      if (Math.abs(matchDiff) < WordMatch.magnitude) {
        val distDiff = that.relativeDistance - this.relativeDistance; // for distance lower is better
        Math.signum(distDiff).toInt
      } else {
        Math.signum(matchDiff).toInt
      }
    }
  }

  def isSignificant(): Boolean = relativeMatch > WordMatch.significance;
}

object WordMatch {

  val significance = 0.3f;
  val magnitude = 0.01f;

  def matchFor(needle: String, word: String): WordMatch = {
    val lowWord = word.toLowerCase();
    val flen = lowWord.length().toFloat;
    val nlen = needle.length().toFloat;
    val dist = EditDistance.editDist(needle, lowWord);
    val rDist = (dist.toFloat) / flen;
    val lMatch = longestMatch(needle, lowWord);
    val rMatch = (lMatch.toFloat) / nlen;
    WordMatch(word, rMatch, rDist)
  }

  def perfect(word: String): WordMatch = {
    WordMatch(word, 1.0f, 0.0f)
  }

  private def longestMatch(needle: String, word: String): Int = {
    val maxPossible = Math.min(needle.length(), word.length());
    for (l <- (maxPossible to 0 by -1)) {
      val prefix = needle.substring(0, l);
      val suffix = needle.substring(needle.length() - l);
      if (word.contains(prefix) || word.contains(suffix)) {
        return l;
      }
    }
    return 0;
  }
}
