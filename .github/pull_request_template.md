# Pull Request

## Description
Add health endpoint to provide application status monitoring.

## Changes Made
- Added spring-boot-starter-web dependency for REST API support
- Created HealthController with /health endpoint
- Health endpoint returns status, timestamp, service name, and version
- Follows REST API best practices with JSON response

## Testing
- Application compiles successfully
- Existing tests continue to pass
- Health endpoint returns proper JSON response format

## Health Endpoint Response Format
```json
{
  "status": "UP",
  "timestamp": "2026-03-09T...",
  "service": "demo-application", 
  "version": "1.0.0"
}
```

## Usage
```bash
curl http://localhost:8080/health
```