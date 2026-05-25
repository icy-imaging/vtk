// java wrapper for vtkInformationStringVectorKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationStringVectorKey extends vtkInformationKey
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

  private native long MakeKey_4(byte[] id0, int len0,byte[] id1, int len1,int id2);
  public vtkInformationStringVectorKey MakeKey(String id0,String id1,int id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    long temp = MakeKey_4(bytes0, bytes0.length,bytes1, bytes1.length,id2);

    if (temp == 0) return null;
    return (vtkInformationStringVectorKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Append_5(vtkInformation id0,byte[] id1, int len1);
  public void Append(vtkInformation id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    Append_5(id0,bytes1, bytes1.length);
  }

  private native void Set_6(vtkInformation id0,byte[] id1, int len1,int id2);
  public void Set(vtkInformation id0,String id1,int id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    Set_6(id0,bytes1, bytes1.length,id2);
  }

  private native byte[] Get_7(vtkInformation id0,int id1);
  public String Get(vtkInformation id0,int id1)
  {
    return new String(Get_7(id0,id1), StandardCharsets.UTF_8);
  }

  private native int Length_8(vtkInformation id0);
  public int Length(vtkInformation id0)
  {
    return Length_8(id0);
  }

  private native void ShallowCopy_9(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_9(id0,id1);
  }

  public vtkInformationStringVectorKey() { super(); }

  public vtkInformationStringVectorKey(long id) { super(id); }

}
