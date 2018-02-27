/*
 *  TeleStax, Open Source Cloud Communications
 *  Copyright 2011-2018, Telestax Inc and individual contributors
 *  by the @authors tag.
 *
 *  This is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU Lesser General Public License as
 *  published by the Free Software Foundation; either version 2.1 of
 *  the License, or (at your option) any later version.
 *
 *  This software is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this software; if not, write to the Free
 *  Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 *  02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.restcomm.media.server.standalone.bootstrap.ioc.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Rosa (henrique.rosa@telestax.com) created on 26/02/2018
 */
@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "mediaserver.resources.dtmfDetector")
public class DtmfDetectorConfiguration {

    private int dbi = -25;
    private int toneDuration = 100;
    private int toneInterval = 400;

    public int getDbi() {
        return dbi;
    }

    public void setDbi(int dbi) {
        this.dbi = dbi;
    }

    public int getToneDuration() {
        return toneDuration;
    }

    public void setToneDuration(int toneDuration) {
        this.toneDuration = toneDuration;
    }

    public int getToneInterval() {
        return toneInterval;
    }

    public void setToneInterval(int toneInterval) {
        this.toneInterval = toneInterval;
    }

}
