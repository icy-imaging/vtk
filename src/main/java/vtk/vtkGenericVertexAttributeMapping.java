// java wrapper for vtkGenericVertexAttributeMapping object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericVertexAttributeMapping extends vtkObject
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void AddMapping_4(byte[] id0, int len0,byte[] id1, int len1,int id2,int id3);
  public void AddMapping(String id0,String id1,int id2,int id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddMapping_4(bytes0, bytes0.length,bytes1, bytes1.length,id2,id3);
  }

  private native void AddMapping_5(int id0,byte[] id1, int len1,int id2,int id3);
  public void AddMapping(int id0,String id1,int id2,int id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddMapping_5(id0,bytes1, bytes1.length,id2,id3);
  }

  private native boolean RemoveMapping_6(byte[] id0, int len0);
  public boolean RemoveMapping(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return RemoveMapping_6(bytes0, bytes0.length);
  }

  private native void RemoveAllMappings_7();
  public void RemoveAllMappings()
  {
    RemoveAllMappings_7();
  }

  private native int GetNumberOfMappings_8();
  public int GetNumberOfMappings()
  {
    return GetNumberOfMappings_8();
  }

  private native byte[] GetAttributeName_9(int id0);
  public String GetAttributeName(int id0)
  {
    return new String(GetAttributeName_9(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetArrayName_10(int id0);
  public String GetArrayName(int id0)
  {
    return new String(GetArrayName_10(id0), StandardCharsets.UTF_8);
  }

  private native int GetFieldAssociation_11(int id0);
  public int GetFieldAssociation(int id0)
  {
    return GetFieldAssociation_11(id0);
  }

  private native int GetComponent_12(int id0);
  public int GetComponent(int id0)
  {
    return GetComponent_12(id0);
  }

  private native int GetTextureUnit_13(int id0);
  public int GetTextureUnit(int id0)
  {
    return GetTextureUnit_13(id0);
  }

  public vtkGenericVertexAttributeMapping() { super(); }

  public vtkGenericVertexAttributeMapping(long id) { super(id); }
  public native long   VTKInit();

}
