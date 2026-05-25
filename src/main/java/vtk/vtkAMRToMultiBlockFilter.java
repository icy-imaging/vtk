// java wrapper for vtkAMRToMultiBlockFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAMRToMultiBlockFilter extends vtkMultiBlockDataSetAlgorithm
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

  private native int FillInputPortInformation_6(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_6(id0,id1);
  }

  private native int FillOutputPortInformation_7(int id0,vtkInformation id1);
  public int FillOutputPortInformation(int id0,vtkInformation id1)
  {
    return FillOutputPortInformation_7(id0,id1);
  }

  public vtkAMRToMultiBlockFilter() { super(); }

  public vtkAMRToMultiBlockFilter(long id) { super(id); }
  public native long   VTKInit();

}
