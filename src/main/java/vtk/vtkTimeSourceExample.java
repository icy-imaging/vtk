// java wrapper for vtkTimeSourceExample object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTimeSourceExample extends vtkUnstructuredGridAlgorithm
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

  private native void SetAnalytic_4(int id0);
  public void SetAnalytic(int id0)
  {
    SetAnalytic_4(id0);
  }

  private native int GetAnalyticMinValue_5();
  public int GetAnalyticMinValue()
  {
    return GetAnalyticMinValue_5();
  }

  private native int GetAnalyticMaxValue_6();
  public int GetAnalyticMaxValue()
  {
    return GetAnalyticMaxValue_6();
  }

  private native int GetAnalytic_7();
  public int GetAnalytic()
  {
    return GetAnalytic_7();
  }

  private native void AnalyticOn_8();
  public void AnalyticOn()
  {
    AnalyticOn_8();
  }

  private native void AnalyticOff_9();
  public void AnalyticOff()
  {
    AnalyticOff_9();
  }

  private native void SetXAmplitude_10(double id0);
  public void SetXAmplitude(double id0)
  {
    SetXAmplitude_10(id0);
  }

  private native double GetXAmplitude_11();
  public double GetXAmplitude()
  {
    return GetXAmplitude_11();
  }

  private native void SetYAmplitude_12(double id0);
  public void SetYAmplitude(double id0)
  {
    SetYAmplitude_12(id0);
  }

  private native double GetYAmplitude_13();
  public double GetYAmplitude()
  {
    return GetYAmplitude_13();
  }

  private native void SetGrowing_14(int id0);
  public void SetGrowing(int id0)
  {
    SetGrowing_14(id0);
  }

  private native int GetGrowingMinValue_15();
  public int GetGrowingMinValue()
  {
    return GetGrowingMinValue_15();
  }

  private native int GetGrowingMaxValue_16();
  public int GetGrowingMaxValue()
  {
    return GetGrowingMaxValue_16();
  }

  private native int GetGrowing_17();
  public int GetGrowing()
  {
    return GetGrowing_17();
  }

  private native void GrowingOn_18();
  public void GrowingOn()
  {
    GrowingOn_18();
  }

  private native void GrowingOff_19();
  public void GrowingOff()
  {
    GrowingOff_19();
  }

  public vtkTimeSourceExample() { super(); }

  public vtkTimeSourceExample(long id) { super(id); }
  public native long   VTKInit();

}
