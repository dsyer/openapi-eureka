package com.example.eurekademo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;
import com.netflix.discovery.shared.Application;
import com.netflix.discovery.shared.Applications;
import com.netflix.eureka.util.StatusInfo;

@SpringBootApplication
public class EurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemoApplication.class, args);
	}

}

@RestController
@RequestMapping("/serverinfo")
class ServerInfoController {
	@GetMapping("/statusoverrides")
	Map<String, InstanceStatus> overrides() {
		return Map.of();
	}
}

@RestController
@RequestMapping("/{version}")
class AppsController {

	@GetMapping("/apps")
	Applications applications(@PathVariable String version, @RequestParam String regions, @RequestHeader("X-Eureka-Accept") String eurekaAccept) {
		return null;
	}

	@GetMapping("/apps/delta")
	Applications deltas(@PathVariable String version, @RequestParam String regions, @RequestHeader("X-Eureka-Accept") String eurekaAccept) {
		return null;
	}

}

@RestController
@RequestMapping("/{version}/apps/{appId}")
class AppController {

	@GetMapping
	Application info(@PathVariable String version, @PathVariable String appId, @RequestParam String regions, @RequestHeader("X-Eureka-Accept") String eurekaAccept) {
		return null;
	}

	@PostMapping
	Application add(@PathVariable String version, @PathVariable String appId, @RequestParam String regions, @RequestHeader("X-Eureka-Accept") String eurekaAccept, @RequestBody InstanceInfo instance) {
		return null;
	}

	@GetMapping("/{id}")
	InstanceInfo instance(@PathVariable String version, @PathVariable String appId, @PathVariable String id, @RequestHeader("x-netflix-discovery-replication") String replication) {
		return null;
	}

	@PutMapping("/{id}")
	void add(@PathVariable String version, @PathVariable String appId, @PathVariable String id, @RequestBody InstanceInfo info, @RequestParam String lastDirtyTimestamp, @RequestParam String overriddenstatus, @RequestParam String status, @RequestHeader("x-netflix-discovery-replication") String replication) {
	}

	@DeleteMapping("/{id}")
	void delete(@PathVariable String version, @PathVariable String appId, @PathVariable String id, @RequestHeader("x-netflix-discovery-replication") String replication) {
	}

	@PutMapping("/{id}/metadata")
	void metadata(@PathVariable String version, @PathVariable String appId, @PathVariable String id) {
	}

	@PutMapping("/{id}/status")
	void status(@PathVariable String version, @PathVariable String appId, @PathVariable String id, @RequestParam String lastDirtyTimestamp, @RequestParam String value, @RequestHeader("x-netflix-discovery-replication") String replication) {
	}

	@DeleteMapping("/{id}/status")
	void cancel(@PathVariable String version, @PathVariable String appId, @PathVariable String id, @RequestParam String lastDirtyTimestamp, @RequestParam String value, @RequestHeader("x-netflix-discovery-replication") String replication) {
	}
}

@RestController
@RequestMapping("/{version}/asg")
class AsgController {

	@PutMapping("/{asgName}/status")
	void info(@PathVariable String version, @PathVariable String asgName, @RequestHeader("x-netflix-discovery-replication") String replication) {
	}

}

@RestController
@RequestMapping("/{version}/instances/{id}")
class InstanceController {

	@GetMapping
	InstanceInfo info(@PathVariable String version, @PathVariable String id, @RequestParam String value) {
		return null;
	}

}

@RestController
@RequestMapping("/{version}/status")
class StatusController {

	@GetMapping
	StatusInfo info(@PathVariable String version) {
		return null;
	}

}

@RestController
@RequestMapping("/{version}/vips")
class VipsController {

	@GetMapping("/{vipAddress}")
	Applications info(@PathVariable String version, @PathVariable String vipAddress, @RequestHeader("X-Eureka-Accept") String eurekaAccept) {
		return null;
	}

}

@RestController
@RequestMapping("/{version}/svips")
class SvipsController {

	@GetMapping("/{svipAddress}")
	Applications info(@PathVariable String version, @PathVariable String svipAddress, @RequestHeader("X-Eureka-Accept") String eurekaAccept) {
		return null;
	}

}