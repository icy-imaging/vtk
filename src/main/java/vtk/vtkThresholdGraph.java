// java wrapper for vtkThresholdGraph object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkThresholdGraph extends vtkGraphAlgorithm
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

  private native double GetLowerThreshold_4();
  public double GetLowerThreshold()
  {
    return GetLowerThreshold_4();
  }

  private native void SetLowerThreshold_5(double id0);
  public void SetLowerThreshold(double id0)
  {
    SetLowerThreshold_5(id0);
  }

  private native double GetUpperThreshold_6();
  public double GetUpperThreshold()
  {
    return GetUpperThreshold_6();
  }

  private native void SetUpperThreshold_7(double id0);
  public void SetUpperThreshold(double id0)
  {
    SetUpperThreshold_7(id0);
  }

  public vtkThresholdGraph() { super(); }

  public vtkThresholdGraph(long id) { super(id); }
  public native long   VTKInit();

}
