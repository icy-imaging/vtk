// java wrapper for vtkInformationObjectBaseKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationObjectBaseKey extends vtkInformationKey
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

  private native long MakeKey_4(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2);
  public vtkInformationObjectBaseKey MakeKey(String id0,String id1,String id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    long temp = MakeKey_4(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length);

    if (temp == 0) return null;
    return (vtkInformationObjectBaseKey)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Set_5(vtkInformation id0,vtkObjectBase id1);
  public void Set(vtkInformation id0,vtkObjectBase id1)
  {
    Set_5(id0,id1);
  }

  private native long Get_6(vtkInformation id0);
  public vtkObjectBase Get(vtkInformation id0)
  {
    long temp = Get_6(id0);

    if (temp == 0) return null;
    return (vtkObjectBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_7(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_7(id0,id1);
  }

  private native void Report_8(vtkInformation id0,vtkGarbageCollector id1);
  public void Report(vtkInformation id0,vtkGarbageCollector id1)
  {
    Report_8(id0,id1);
  }

  public vtkInformationObjectBaseKey() { super(); }

  public vtkInformationObjectBaseKey(long id) { super(id); }

}
