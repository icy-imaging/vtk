// java wrapper for vtkTreeOrbitLayoutStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeOrbitLayoutStrategy extends vtkGraphLayoutStrategy
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

  private native void Layout_4();
  public void Layout()
  {
    Layout_4();
  }

  private native void SetLogSpacingValue_5(double id0);
  public void SetLogSpacingValue(double id0)
  {
    SetLogSpacingValue_5(id0);
  }

  private native double GetLogSpacingValue_6();
  public double GetLogSpacingValue()
  {
    return GetLogSpacingValue_6();
  }

  private native void SetLeafSpacing_7(double id0);
  public void SetLeafSpacing(double id0)
  {
    SetLeafSpacing_7(id0);
  }

  private native double GetLeafSpacingMinValue_8();
  public double GetLeafSpacingMinValue()
  {
    return GetLeafSpacingMinValue_8();
  }

  private native double GetLeafSpacingMaxValue_9();
  public double GetLeafSpacingMaxValue()
  {
    return GetLeafSpacingMaxValue_9();
  }

  private native double GetLeafSpacing_10();
  public double GetLeafSpacing()
  {
    return GetLeafSpacing_10();
  }

  private native void SetChildRadiusFactor_11(double id0);
  public void SetChildRadiusFactor(double id0)
  {
    SetChildRadiusFactor_11(id0);
  }

  private native double GetChildRadiusFactor_12();
  public double GetChildRadiusFactor()
  {
    return GetChildRadiusFactor_12();
  }

  public vtkTreeOrbitLayoutStrategy() { super(); }

  public vtkTreeOrbitLayoutStrategy(long id) { super(id); }
  public native long   VTKInit();

}
