// java wrapper for vtkNonOverlappingAMR object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNonOverlappingAMR extends vtkUniformGridAMR
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

  private native int GetDataObjectType_4();
  public int GetDataObjectType()
  {
    return GetDataObjectType_4();
  }

  private native long GetData_5(vtkInformation id0);
  public vtkNonOverlappingAMR GetData(vtkInformation id0)
  {
    long temp = GetData_5(id0);

    if (temp == 0) return null;
    return (vtkNonOverlappingAMR)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetData_6(vtkInformationVector id0,int id1);
  public vtkNonOverlappingAMR GetData(vtkInformationVector id0,int id1)
  {
    long temp = GetData_6(id0,id1);

    if (temp == 0) return null;
    return (vtkNonOverlappingAMR)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkNonOverlappingAMR() { super(); }

  public vtkNonOverlappingAMR(long id) { super(id); }
  public native long   VTKInit();

}
