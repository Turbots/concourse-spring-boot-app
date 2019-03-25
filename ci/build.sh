#!/bin/bash

pushd demo-src/

mvn package -Dmaven.repo.local=.m2
cp target/*.jar ../build/demo-app.jar
cp ci/manifest.yml ../build/manifest.yml

popd