// Define function
def call(String ProjectName, String ImageTag, String DockerHubUser){
   echo "This is Building the code or docker image"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Image build successfully thourgh shared libraries"
}
