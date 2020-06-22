#!/bin/bash

set -e

<<<<<<< HEAD
REPO=https://cloud.r-project.org
=======
REPO=http://cran.revolutionanalytics.com
>>>>>>> ooof

export R_LIBS_USER=$HOME/R

echo "R lib directory: $R_LIBS_USER"

mkdir $R_LIBS_USER || true

Rscript -e "install.packages('jsonlite', repos='$REPO', lib='$R_LIBS_USER')"
Rscript -e "install.packages('httr', repos='$REPO', lib='$R_LIBS_USER')"
Rscript -e "install.packages('testthat', repos='$REPO', lib='$R_LIBS_USER')"
Rscript -e "install.packages('R6', repos='$REPO', lib='$R_LIBS_USER')"
<<<<<<< HEAD
Rscript -e "install.packages('base64enc', repos='$REPO', lib='$R_LIBS_USER')"
=======
Rscript -e "install.packages('caTools', repos='$REPO', lib='$R_LIBS_USER')"
>>>>>>> ooof
Rscript -e "install.packages('rlang', repos='$REPO', lib='$R_LIBS_USER')"

R CMD build .
R CMD check *tar.gz --no-manual
R CMD INSTALL *tar.gz
