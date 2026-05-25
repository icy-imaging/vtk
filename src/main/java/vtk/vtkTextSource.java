// java wrapper for vtkTextSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextSource extends vtkPolyDataAlgorithm
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

  private native void SetText_4(byte[] id0, int len0);
  public void SetText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetText_4(bytes0, bytes0.length);
  }

  private native byte[] GetText_5();
  public String GetText()
  {
    return new String(GetText_5(), StandardCharsets.UTF_8);
  }

  private native void SetBacking_6(int id0);
  public void SetBacking(int id0)
  {
    SetBacking_6(id0);
  }

  private native int GetBacking_7();
  public int GetBacking()
  {
    return GetBacking_7();
  }

  private native void BackingOn_8();
  public void BackingOn()
  {
    BackingOn_8();
  }

  private native void BackingOff_9();
  public void BackingOff()
  {
    BackingOff_9();
  }

  private native void SetForegroundColor_10(double id0,double id1,double id2);
  public void SetForegroundColor(double id0,double id1,double id2)
  {
    SetForegroundColor_10(id0,id1,id2);
  }

  private native void SetForegroundColor_11(double id0[]);
  public void SetForegroundColor(double id0[])
  {
    SetForegroundColor_11(id0);
  }

  private native double[] GetForegroundColor_12();
  public double[] GetForegroundColor()
  {
    return GetForegroundColor_12();
  }

  private native void SetBackgroundColor_13(double id0,double id1,double id2);
  public void SetBackgroundColor(double id0,double id1,double id2)
  {
    SetBackgroundColor_13(id0,id1,id2);
  }

  private native void SetBackgroundColor_14(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_14(id0);
  }

  private native double[] GetBackgroundColor_15();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_15();
  }

  private native void SetOutputPointsPrecision_16(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_16(id0);
  }

  private native int GetOutputPointsPrecision_17();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_17();
  }

  public vtkTextSource() { super(); }

  public vtkTextSource(long id) { super(id); }
  public native long   VTKInit();

}
