variable "aws_region" {
  description = "AWS Region"
  type = string
  default = "ap-south-1"
}

variable "project_name" {
  description = "Project Name"
  type = string
  default = "runnerz"
}

variable "environment"{
  description = "Environment - dev/test/prod"
  type = string
  default = "dev"
}