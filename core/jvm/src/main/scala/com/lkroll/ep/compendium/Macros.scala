package com.lkroll.ep.compendium

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context;

object Macros {

  class Impl(val c: Context) {
    def memberList[T: c.WeakTypeTag]: c.Tree = {
      import c.universe._

      val outputType = weakTypeTag[T].tpe;

      val owner = c.internal.enclosingOwner;
      //println(s"Owner ${owner.fullName}");
      val enclosingClass = if (owner.isClass) {
        //println(s"Owner is class ${owner.asClass}");
        owner.asClass
      } else if (owner.owner.isClass) {
        //println(s"Owner's owner is class ${owner.owner.asClass}");
        owner.owner.asClass
      } else {
        println(s"Oh noes...the owner is weird: ${owner.owner.fullName}");
        return q"???"
      };
      val enclosingType: Type = enclosingClass.asType.toType;

      //      val entries = ..collect {
      //        case m => println(s"found a ${c.internal.enclosingOwner.}"); q"null"
      //      }.toList;
      val entries: List[Tree] = enclosingType.members.flatMap {
        case m if ((m != owner) && (!m.isType)) => {
          val t = m.asTerm;
          //println(s"Member: ${t.fullName}");
          val termInfo = t.info;
          if (termInfo =:= outputType) {
            //println(s"Weapon Member: ${t}");
            val name = t.name;
            Some(q"$name")
          } else {
            None
          }
        }
        case _ => None
      }.toList;

      q"List(..$entries)"
    }
  }

  def memberList[T]: List[T] = macro Impl.memberList[T];

}
