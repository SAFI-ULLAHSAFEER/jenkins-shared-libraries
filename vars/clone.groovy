def call(String GitUrl, String GitBranch){
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "code clonning successfully"
}

