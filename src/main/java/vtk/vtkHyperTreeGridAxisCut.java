// java wrapper for vtkHyperTreeGridAxisCut object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridAxisCut extends vtkHyperTreeGridAlgorithm
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

  private native void SetPlaneNormalAxis_4(int id0);
  public void SetPlaneNormalAxis(int id0)
  {
    SetPlaneNormalAxis_4(id0);
  }

  private native int GetPlaneNormalAxisMinValue_5();
  public int GetPlaneNormalAxisMinValue()
  {
    return GetPlaneNormalAxisMinValue_5();
  }

  private native int GetPlaneNormalAxisMaxValue_6();
  public int GetPlaneNormalAxisMaxValue()
  {
    return GetPlaneNormalAxisMaxValue_6();
  }

  private native int GetPlaneNormalAxis_7();
  public int GetPlaneNormalAxis()
  {
    return GetPlaneNormalAxis_7();
  }

  private native void SetPlanePosition_8(double id0);
  public void SetPlanePosition(double id0)
  {
    SetPlanePosition_8(id0);
  }

  private native double GetPlanePosition_9();
  public double GetPlanePosition()
  {
    return GetPlanePosition_9();
  }

  public vtkHyperTreeGridAxisCut() { super(); }

  public vtkHyperTreeGridAxisCut(long id) { super(id); }
  public native long   VTKInit();

}
