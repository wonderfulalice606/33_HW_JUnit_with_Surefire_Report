#!/bin/sh

#===========================================================================================
GITHUB=wonderfulalice606
WS_DIR=workspace
DOC=Documents
REPO=33_HW_JUnit_with_Surefire_Report
RUNNER=Test_Runner

#===========================================================================================

if ! which java > /dev/null 2>&1; then echo Java is not installed; return; fi
if ! which mvn > /dev/null 2>&1; then echo Maven is not installed; return; fi
if ! which git > /dev/null 2>&1; then echo Git is not installed; return; fi

if [ -d "$HOME/$DOC/$WS_DIR/" ]; then cd ~/$DOC/$WS_DIR/$RUNNER; else echo $WS_DIR is not exist; return; fi
if [ -d "$HOME/$DOC/$WS_DIR/$RUNNER/$REPO" ]; then rm -rf $HOME/$DOC/$WS_DIR/$RUNNER/$REPO; fi

git clone https://github.com/$GITHUB/$REPO.git
cd ./$REPO

mvn test -Dtest=CalculatorTest01
mvn test -Dtest=CalculatorTest02
mvn clean site -Dtest=CalculatorTest02

echo "$HOME/$DOC/$WS_DIR/$RUNNER/$REPO"
