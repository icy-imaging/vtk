// java wrapper for vtkEarthSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEarthSource extends vtkPolyDataAlgorithm
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

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadiusMinValue_5();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_5();
  }

  private native double GetRadiusMaxValue_6();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_6();
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetOnRatio_8(int id0);
  public void SetOnRatio(int id0)
  {
    SetOnRatio_8(id0);
  }

  private native int GetOnRatioMinValue_9();
  public int GetOnRatioMinValue()
  {
    return GetOnRatioMinValue_9();
  }

  private native int GetOnRatioMaxValue_10();
  public int GetOnRatioMaxValue()
  {
    return GetOnRatioMaxValue_10();
  }

  private native int GetOnRatio_11();
  public int GetOnRatio()
  {
    return GetOnRatio_11();
  }

  private native void SetOutline_12(int id0);
  public void SetOutline(int id0)
  {
    SetOutline_12(id0);
  }

  private native int GetOutline_13();
  public int GetOutline()
  {
    return GetOutline_13();
  }

  private native void OutlineOn_14();
  public void OutlineOn()
  {
    OutlineOn_14();
  }

  private native void OutlineOff_15();
  public void OutlineOff()
  {
    OutlineOff_15();
  }

  public vtkEarthSource() { super(); }

  public vtkEarthSource(long id) { super(id); }
  public native long   VTKInit();

}
