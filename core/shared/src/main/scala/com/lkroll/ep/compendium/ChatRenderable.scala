package com.lkroll.ep.compendium

trait ChatRenderable {
  def lookupName: String = templateTitle;
  def templateTitle: String = "No Title";
  def templateSubTitle: String = "No Subtitle";
  def templateKV: Map[String, String] = Map.empty;
  def templateDescr: String = "–";
}
