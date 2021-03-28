#!/bin/bash

sbt "; + publishSigned; sonatypeBundleRelease"
