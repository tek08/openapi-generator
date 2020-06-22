package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
=======
import java.util.List;
>>>>>>> ooof
import org.openapitools.model.Category;
import org.openapitools.model.Tag;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;



<<<<<<< HEAD
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen")public class Pet  implements Serializable {
=======
public class Pet  implements Serializable {
>>>>>>> ooof
  
  private @Valid Long id;
  private @Valid Category category;
  private @Valid String name;
<<<<<<< HEAD
  private @Valid Set<String> photoUrls = new LinkedHashSet<String>();
=======
  private @Valid List<String> photoUrls = new ArrayList<String>();
>>>>>>> ooof
  private @Valid List<Tag> tags = new ArrayList<Tag>();

public enum StatusEnum {

    AVAILABLE(String.valueOf("available")), PENDING(String.valueOf("pending")), SOLD(String.valueOf("sold"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid StatusEnum status;

  /**
   **/
  public Pet id(Long id) {
    this.id = id;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
<<<<<<< HEAD

  public void setId(Long id) {
    this.id = id;
  }/**
=======
  public void setId(Long id) {
    this.id = id;
  }

  /**
>>>>>>> ooof
   **/
  public Pet category(Category category) {
    this.category = category;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("category")
  public Category getCategory() {
    return category;
  }
<<<<<<< HEAD

  public void setCategory(Category category) {
    this.category = category;
  }/**
=======
  public void setCategory(Category category) {
    this.category = category;
  }

  /**
>>>>>>> ooof
   **/
  public Pet name(String name) {
    this.name = name;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
<<<<<<< HEAD

  public void setName(String name) {
    this.name = name;
  }/**
   **/
  public Pet photoUrls(Set<String> photoUrls) {
=======
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Pet photoUrls(List<String> photoUrls) {
>>>>>>> ooof
    this.photoUrls = photoUrls;
    return this;
  }

  
<<<<<<< HEAD

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("photoUrls")
  @NotNull
  public Set<String> getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(Set<String> photoUrls) {
    this.photoUrls = photoUrls;
  }/**
=======
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("photoUrls")
  @NotNull
  public List<String> getPhotoUrls() {
    return photoUrls;
  }
  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  /**
>>>>>>> ooof
   **/
  public Pet tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "")
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }
<<<<<<< HEAD

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }/**
=======
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  /**
>>>>>>> ooof
   * pet status in the store
   **/
  public Pet status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
<<<<<<< HEAD

  
=======
>>>>>>> ooof
  @ApiModelProperty(value = "pet status in the store")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
<<<<<<< HEAD

=======
>>>>>>> ooof
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

<<<<<<< HEAD
=======

>>>>>>> ooof
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pet pet = (Pet) o;
    return Objects.equals(this.id, pet.id) &&
        Objects.equals(this.category, pet.category) &&
        Objects.equals(this.name, pet.name) &&
        Objects.equals(this.photoUrls, pet.photoUrls) &&
        Objects.equals(this.tags, pet.tags) &&
        Objects.equals(this.status, pet.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, category, name, photoUrls, tags, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
<<<<<<< HEAD


=======
>>>>>>> ooof
}

