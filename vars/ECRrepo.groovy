def ecr(String AWS_ACCOUNT_ID,String AWS_DEFAULT_REGION,String IMAGE_REPO_NAME,String IMAGE_TAG,String REPOSITORY_URI)
{
  def command="${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com/${IMAGE_REPO_NAME}"
  def command="aws ecr get-login-password --region ${AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin ${AWS_ACCOUNT_ID}.dkr.ecr.${AWS_DEFAULT_REGION}.amazonaws.com"
}
