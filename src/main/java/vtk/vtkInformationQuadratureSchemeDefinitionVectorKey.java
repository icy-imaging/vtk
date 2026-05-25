// java wrapper for vtkInformationQuadratureSchemeDefinitionVectorKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationQuadratureSchemeDefinitionVectorKey extends vtkInformationKey
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

  private native void Clear_4(vtkInformation id0);
  public void Clear(vtkInformation id0)
  {
    Clear_4(id0);
  }

  private native void Resize_5(vtkInformation id0,int id1);
  public void Resize(vtkInformation id0,int id1)
  {
    Resize_5(id0,id1);
  }

  private native int Size_6(vtkInformation id0);
  public int Size(vtkInformation id0)
  {
    return Size_6(id0);
  }

  private native int Length_7(vtkInformation id0);
  public int Length(vtkInformation id0)
  {
    return Length_7(id0);
  }

  private native void Append_8(vtkInformation id0,vtkQuadratureSchemeDefinition id1);
  public void Append(vtkInformation id0,vtkQuadratureSchemeDefinition id1)
  {
    Append_8(id0,id1);
  }

  private native void Set_9(vtkInformation id0,vtkQuadratureSchemeDefinition id1,int id2);
  public void Set(vtkInformation id0,vtkQuadratureSchemeDefinition id1,int id2)
  {
    Set_9(id0,id1,id2);
  }

  private native long Get_10(vtkInformation id0,int id1);
  public vtkQuadratureSchemeDefinition Get(vtkInformation id0,int id1)
  {
    long temp = Get_10(id0,id1);

    if (temp == 0) return null;
    return (vtkQuadratureSchemeDefinition)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_11(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_11(id0,id1);
  }

  private native void DeepCopy_12(vtkInformation id0,vtkInformation id1);
  public void DeepCopy(vtkInformation id0,vtkInformation id1)
  {
    DeepCopy_12(id0,id1);
  }

  private native int SaveState_13(vtkInformation id0,vtkXMLDataElement id1);
  public int SaveState(vtkInformation id0,vtkXMLDataElement id1)
  {
    return SaveState_13(id0,id1);
  }

  private native int RestoreState_14(vtkInformation id0,vtkXMLDataElement id1);
  public int RestoreState(vtkInformation id0,vtkXMLDataElement id1)
  {
    return RestoreState_14(id0,id1);
  }

  public vtkInformationQuadratureSchemeDefinitionVectorKey() { super(); }

  public vtkInformationQuadratureSchemeDefinitionVectorKey(long id) { super(id); }

}
