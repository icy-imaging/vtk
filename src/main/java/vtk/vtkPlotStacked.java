// java wrapper for vtkPlotStacked object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotStacked extends vtkPlot
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

  private native void SetColor_4(byte id0,byte id1,byte id2,byte id3);
  public void SetColor(byte id0,byte id1,byte id2,byte id3)
  {
    SetColor_4(id0,id1,id2,id3);
  }

  private native void SetColorF_5(double id0,double id1,double id2,double id3);
  public void SetColorF(double id0,double id1,double id2,double id3)
  {
    SetColorF_5(id0,id1,id2,id3);
  }

  private native void SetColorF_6(double id0,double id1,double id2);
  public void SetColorF(double id0,double id1,double id2)
  {
    SetColorF_6(id0,id1,id2);
  }

  private native void SetColor_7(double id0,double id1,double id2);
  public void SetColor(double id0,double id1,double id2)
  {
    SetColor_7(id0,id1,id2);
  }

  private native void GetColorF_8(double id0[]);
  public void GetColorF(double id0[])
  {
    GetColorF_8(id0);
  }

  private native void GetColor_9(double id0[]);
  public void GetColor(double id0[])
  {
    GetColor_9(id0);
  }

  private native boolean Paint_10(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_10(id0);
  }

  private native void GetBounds_11(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_11(id0);
  }

  private native void GetUnscaledInputBounds_12(double id0[]);
  public void GetUnscaledInputBounds(double id0[])
  {
    GetUnscaledInputBounds_12(id0);
  }

  private native void SetInputArray_13(int id0,byte[] id1, int len1);
  public void SetInputArray(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetInputArray_13(id0,bytes1, bytes1.length);
  }

  private native void SetColorSeries_14(vtkColorSeries id0);
  public void SetColorSeries(vtkColorSeries id0)
  {
    SetColorSeries_14(id0);
  }

  private native long GetColorSeries_15();
  public vtkColorSeries GetColorSeries()
  {
    long temp = GetColorSeries_15();

    if (temp == 0) return null;
    return (vtkColorSeries)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabels_16();
  public vtkStringArray GetLabels()
  {
    long temp = GetLabels_16();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean UpdateCache_17();
  public boolean UpdateCache()
  {
    return UpdateCache_17();
  }

  public vtkPlotStacked() { super(); }

  public vtkPlotStacked(long id) { super(id); }
  public native long   VTKInit();

}
