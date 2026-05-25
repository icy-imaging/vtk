// java wrapper for vtkInformationInformationVectorKey object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkInformationInformationVectorKey extends vtkInformationKey
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

  private native void Set_4(vtkInformation id0,vtkInformationVector id1);
  public void Set(vtkInformation id0,vtkInformationVector id1)
  {
    Set_4(id0,id1);
  }

  private native long Get_5(vtkInformation id0);
  public vtkInformationVector Get(vtkInformation id0)
  {
    long temp = Get_5(id0);

    if (temp == 0) return null;
    return (vtkInformationVector)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ShallowCopy_6(vtkInformation id0,vtkInformation id1);
  public void ShallowCopy(vtkInformation id0,vtkInformation id1)
  {
    ShallowCopy_6(id0,id1);
  }

  private native void DeepCopy_7(vtkInformation id0,vtkInformation id1);
  public void DeepCopy(vtkInformation id0,vtkInformation id1)
  {
    DeepCopy_7(id0,id1);
  }

  private native void Report_8(vtkInformation id0,vtkGarbageCollector id1);
  public void Report(vtkInformation id0,vtkGarbageCollector id1)
  {
    Report_8(id0,id1);
  }

  public vtkInformationInformationVectorKey() { super(); }

  public vtkInformationInformationVectorKey(long id) { super(id); }

}
