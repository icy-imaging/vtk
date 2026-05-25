// java wrapper for vtkSplitSharpEdgesPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSplitSharpEdgesPolyData extends vtkPolyDataAlgorithm
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

  private native void SetFeatureAngle_4(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_4(id0);
  }

  private native double GetFeatureAngleMinValue_5();
  public double GetFeatureAngleMinValue()
  {
    return GetFeatureAngleMinValue_5();
  }

  private native double GetFeatureAngleMaxValue_6();
  public double GetFeatureAngleMaxValue()
  {
    return GetFeatureAngleMaxValue_6();
  }

  private native double GetFeatureAngle_7();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_7();
  }

  private native void SetOutputPointsPrecision_8(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_8(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_9();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_9();
  }

  private native int GetOutputPointsPrecisionMaxValue_10();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_10();
  }

  private native int GetOutputPointsPrecision_11();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_11();
  }

  public vtkSplitSharpEdgesPolyData() { super(); }

  public vtkSplitSharpEdgesPolyData(long id) { super(id); }
  public native long   VTKInit();

}
