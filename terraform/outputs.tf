
output "ecr_repository_url" {
  value = aws_ecr_repository.ecr_app.repository_url
}

output "ecs_cluster_name" {
  value = aws_ecs_cluster.ecs_cluster.name
}

output "ecs_service_name" {
  value = aws_ecs_service.ecs_app.name
}