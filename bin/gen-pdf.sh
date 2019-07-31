#!/bin/bash

sbt tut
cp -r slides/docs docs/

for file in docs/*.html
do
 decktape "$file" "${file%.html}.pdf"
done

mkdir -p docs/pdf
mv docs/*.pdf docs/pdf