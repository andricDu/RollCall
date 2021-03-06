package bio.overture.rollcall.index;

import bio.overture.rollcall.index.ResolvedIndex.Part;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
public class IndexNamePart {

  Part part;
  String value;
  List<IndexNamePart> children;

  public IndexNamePart(Part part, String value) {
    this.part = part;
    this.value = value;
    this.children = Collections.emptyList();
  }

}
