#!/bin/bash

pushd source/

mvn package -Dmaven.repo.local=.m2
cp target/*.jar ../build/demo-app.jar

popd