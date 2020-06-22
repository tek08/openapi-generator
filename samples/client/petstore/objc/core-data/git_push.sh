#!/bin/sh
# ref: https://help.github.com/articles/adding-an-existing-project-to-github-using-the-command-line/
#
<<<<<<< HEAD
# Usage example: /bin/sh ./git_push.sh wing328 openapi-pestore-perl "minor update" "gitlab.com"
=======
# Usage example: /bin/sh ./git_push.sh wing328 openapi-pestore-perl "minor update"
>>>>>>> ooof

git_user_id=$1
git_repo_id=$2
release_note=$3
<<<<<<< HEAD
git_host=$4

if [ "$git_host" = "" ]; then
    git_host="github.com"
    echo "[INFO] No command line input provided. Set \$git_host to $git_host"
fi
=======
>>>>>>> ooof

if [ "$git_user_id" = "" ]; then
    git_user_id="GIT_USER_ID"
    echo "[INFO] No command line input provided. Set \$git_user_id to $git_user_id"
fi

if [ "$git_repo_id" = "" ]; then
    git_repo_id="GIT_REPO_ID"
    echo "[INFO] No command line input provided. Set \$git_repo_id to $git_repo_id"
fi

if [ "$release_note" = "" ]; then
    release_note="Minor update"
    echo "[INFO] No command line input provided. Set \$release_note to $release_note"
fi

# Initialize the local directory as a Git repository
git init

# Adds the files in the local repository and stages them for commit.
git add .

<<<<<<< HEAD
# Commits the tracked changes and prepares them to be pushed to a remote repository.
=======
# Commits the tracked changes and prepares them to be pushed to a remote repository. 
>>>>>>> ooof
git commit -m "$release_note"

# Sets the new remote
git_remote=`git remote`
if [ "$git_remote" = "" ]; then # git remote not defined

    if [ "$GIT_TOKEN" = "" ]; then
        echo "[INFO] \$GIT_TOKEN (environment variable) is not set. Using the git credential in your environment."
<<<<<<< HEAD
        git remote add origin https://${git_host}/${git_user_id}/${git_repo_id}.git
    else
        git remote add origin https://${git_user_id}:${GIT_TOKEN}@${git_host}/${git_user_id}/${git_repo_id}.git
=======
        git remote add origin https://github.com/${git_user_id}/${git_repo_id}.git
    else
        git remote add origin https://${git_user_id}:${GIT_TOKEN}@github.com/${git_user_id}/${git_repo_id}.git
>>>>>>> ooof
    fi

fi

git pull origin master

# Pushes (Forces) the changes in the local repository up to the remote repository
<<<<<<< HEAD
echo "Git pushing to https://${git_host}/${git_user_id}/${git_repo_id}.git"
=======
echo "Git pushing to https://github.com/${git_user_id}/${git_repo_id}.git"
>>>>>>> ooof
git push origin master 2>&1 | grep -v 'To https'

