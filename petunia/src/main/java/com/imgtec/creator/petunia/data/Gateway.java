/*
 * <b>Copyright 2016 by Imagination Technologies Limited
 * and/or its affiliated group companies.</b>
 *
 * All rights reserved.  No part of this software, either
 * material or conceptual may be copied or distributed,
 * transmitted, transcribed, stored in a retrieval system
 * or translated into any human or computer language in any
 * form by any means, electronic, mechanical, manual or
 * other-wise, or disclosed to the third parties without the
 * express written permission of Imagination Technologies
 * Limited, Home Park Estate, Kings Langley, Hertfordshire,
 * WD4 8LZ, U.K.
 */

package com.imgtec.creator.petunia.data;


import com.google.gson.Gson;
import com.imgtec.creator.petunia.data.api.pojo.Client;

public class Gateway {

  private final Client client;

  public Gateway(Client client) {
    super();
    this.client = client;
  }

  public String getName() {
    return client.getName();
  }

  public String getDescription() {
    return "";
  }

  public Client getClient() {
    return client;
  }

  public String serialize(Gson gson) {
    return gson.toJson(client, Client.class);
  }

  public static Gateway deserialize(String json, Gson gson) {
    return new Gateway(gson.fromJson(json, Client.class));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Gateway)) return false;

    Gateway gateway = (Gateway) o;

    return getName() != null ? getName().equals(gateway.getName()) : gateway.getName() == null;
  }

  @Override
  public int hashCode() {
    return getName() != null ? getName().hashCode() : 0;
  }
}