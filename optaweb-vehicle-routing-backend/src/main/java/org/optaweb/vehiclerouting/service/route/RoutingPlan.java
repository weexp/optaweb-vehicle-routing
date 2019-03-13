/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.vehiclerouting.service.route;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.optaweb.vehiclerouting.domain.Location;
import org.optaweb.vehiclerouting.domain.RouteWithTrack;

public class RoutingPlan {

    private final String distance;
    private final Location depot;
    private final List<RouteWithTrack> routes;

    public RoutingPlan(String distance, Location depot, List<RouteWithTrack> routes) {
        this.distance = distance;
        this.depot = depot;
        this.routes = routes;
    }

    public static RoutingPlan empty() {
        return new RoutingPlan("0", null, Collections.emptyList());
    }

    public String distance() {
        return distance;
    }

    public List<RouteWithTrack> routes() {
        return routes;
    }

    public Optional<Location> depot() {
        return depot == null ? Optional.empty() : Optional.of(depot);
    }
}
