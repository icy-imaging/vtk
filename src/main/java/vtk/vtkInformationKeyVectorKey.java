// java wrapper for vtkInformationKeyVectorKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationKeyVectorKey extends vtkInformationKey
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

  private native long MakeKey_4(byte[] id0, int len0,byte[] id1, int len1);
  public vtkInformationKeyVectorKey MakeKey(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = MakeKey_4(bytes0, bytes0.length,bytes1, bytes1.length);

    if (temp == 0) return null;
    return (vtkInformationKeyVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Append_5(vtkInformation id0,vtkInformationKey id1);
  public void Append(vtkInformation id0,vtkInformationKey id1)
  {
    Append_5(id0,id1);
  }

  private native void AppendUnique_6(vtkInformation id0,vtkInformationKey id1);
  public void AppendUnique(vtkInformation id0,vtkInformationKey id1)
  {
    AppendUnique_6(id0,id1);
  }

  private native void RemoveItem_7(vtkInformation id0,vtkInformationKey id1);
  public void RemoveItem(vtkInformation id0,vtkInformationKey id1)
  {
    RemoveItem_7(id0,id1);
  }

  private native long Get_8(vtkInformation id0,int id1);
  public vtkInformationKey Get(vtkInformation id0,int id1)
  {
    long temp = Get_8(id0,id1);

    if (temp == 0) return null;
    return (vtkInformationKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int Length_9(vtkInformation id0);
  public int Length(vtkInformation id0)
  {
    return Length_9(id0);
  }

  private native void ShallowCopy_10(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_10(id0,id1);
  }

  public vtkInformationKeyVectorKey() { super(); }

  public vtkInformationKeyVectorKey(long id) { super(id); }

}
