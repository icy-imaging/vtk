// java wrapper for vtkPlotPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPlotPoints extends vtkPlot
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

  private native boolean Paint_4(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_4(id0);
  }

  private native void GetBounds_5(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_5(id0);
  }

  private native void GetUnscaledInputBounds_6(double id0[]);
  public void GetUnscaledInputBounds(double id0[])
  {
    GetUnscaledInputBounds_6(id0);
  }

  private native void SetLookupTable_7(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_7(id0);
  }

  private native long GetLookupTable_8();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_8();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultLookupTable_9();
  public void CreateDefaultLookupTable()
  {
    CreateDefaultLookupTable_9();
  }

  private native void SetScalarVisibility_10(int id0);
  public void SetScalarVisibility(int id0)
  {
    SetScalarVisibility_10(id0);
  }

  private native int GetScalarVisibility_11();
  public int GetScalarVisibility()
  {
    return GetScalarVisibility_11();
  }

  private native void ScalarVisibilityOn_12();
  public void ScalarVisibilityOn()
  {
    ScalarVisibilityOn_12();
  }

  private native void ScalarVisibilityOff_13();
  public void ScalarVisibilityOff()
  {
    ScalarVisibilityOff_13();
  }

  private native void SelectColorArray_14(long id0);
  public void SelectColorArray(long id0)
  {
    SelectColorArray_14(id0);
  }

  private native void SelectColorArray_15(byte[] id0, int len0);
  public void SelectColorArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectColorArray_15(bytes0, bytes0.length);
  }

  private native byte[] GetColorArrayName_16();
  public String GetColorArrayName()
  {
    return new String(GetColorArrayName_16(), StandardCharsets.UTF_8);
  }

  private native int GetMarkerStyle_17();
  public int GetMarkerStyle()
  {
    return GetMarkerStyle_17();
  }

  private native void SetMarkerStyle_18(int id0);
  public void SetMarkerStyle(int id0)
  {
    SetMarkerStyle_18(id0);
  }

  private native float GetMarkerSize_19();
  public float GetMarkerSize()
  {
    return GetMarkerSize_19();
  }

  private native void SetMarkerSize_20(float id0);
  public void SetMarkerSize(float id0)
  {
    SetMarkerSize_20(id0);
  }

  private native byte[] GetValidPointMaskName_21();
  public String GetValidPointMaskName()
  {
    return new String(GetValidPointMaskName_21(), StandardCharsets.UTF_8);
  }

  private native void SetValidPointMaskName_22(byte[] id0, int len0);
  public void SetValidPointMaskName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValidPointMaskName_22(bytes0, bytes0.length);
  }

  private native boolean UpdateCache_23();
  public boolean UpdateCache()
  {
    return UpdateCache_23();
  }

  private native void ReleaseGraphicsCache_24();
  public void ReleaseGraphicsCache()
  {
    ReleaseGraphicsCache_24();
  }

  public vtkPlotPoints() { super(); }

  public vtkPlotPoints(long id) { super(id); }
  public native long   VTKInit();

}
