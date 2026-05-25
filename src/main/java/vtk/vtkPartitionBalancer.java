// java wrapper for vtkPartitionBalancer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPartitionBalancer extends vtkPartitionedDataSetAlgorithm
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

  private native void SetController_4(vtkMultiProcessController id0);
  public void SetController(vtkMultiProcessController id0)
  {
    SetController_4(id0);
  }

  private native long GetController_5();
  public vtkMultiProcessController GetController()
  {
    long temp = GetController_5();

    if (temp == 0) return null;
    return (vtkMultiProcessController)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMode_6(int id0);
  public void SetMode(int id0)
  {
    SetMode_6(id0);
  }

  private native int GetModeMinValue_7();
  public int GetModeMinValue()
  {
    return GetModeMinValue_7();
  }

  private native int GetModeMaxValue_8();
  public int GetModeMaxValue()
  {
    return GetModeMaxValue_8();
  }

  private native int GetMode_9();
  public int GetMode()
  {
    return GetMode_9();
  }

  private native void SetModeToExpand_10();
  public void SetModeToExpand()
  {
    SetModeToExpand_10();
  }

  private native void SetModeToSquash_11();
  public void SetModeToSquash()
  {
    SetModeToSquash_11();
  }

  public vtkPartitionBalancer() { super(); }

  public vtkPartitionBalancer(long id) { super(id); }
  public native long   VTKInit();

}
