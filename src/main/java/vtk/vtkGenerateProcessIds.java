// java wrapper for vtkGenerateProcessIds object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenerateProcessIds extends vtkDataSetAlgorithm
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

  private native void SetGeneratePointData_4(boolean id0);
  public void SetGeneratePointData(boolean id0)
  {
    SetGeneratePointData_4(id0);
  }

  private native boolean GetGeneratePointData_5();
  public boolean GetGeneratePointData()
  {
    return GetGeneratePointData_5();
  }

  private native void GeneratePointDataOn_6();
  public void GeneratePointDataOn()
  {
    GeneratePointDataOn_6();
  }

  private native void GeneratePointDataOff_7();
  public void GeneratePointDataOff()
  {
    GeneratePointDataOff_7();
  }

  private native void SetGenerateCellData_8(boolean id0);
  public void SetGenerateCellData(boolean id0)
  {
    SetGenerateCellData_8(id0);
  }

  private native boolean GetGenerateCellData_9();
  public boolean GetGenerateCellData()
  {
    return GetGenerateCellData_9();
  }

  private native void GenerateCellDataOn_10();
  public void GenerateCellDataOn()
  {
    GenerateCellDataOn_10();
  }

  private native void GenerateCellDataOff_11();
  public void GenerateCellDataOff()
  {
    GenerateCellDataOff_11();
  }

  private native void SetController_12(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_12(id0);
  }

  private native long GetController_13();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_13();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGenerateProcessIds() { super(); }

  public vtkGenerateProcessIds(long id) { super(id); }
  public native long   VTKInit();

}
