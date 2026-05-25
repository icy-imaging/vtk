// java wrapper for vtkChartLegend object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkChartLegend extends vtkContextItem
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

  private native void SetPoint_4(float id0,float id1);
  public void SetPoint(float id0,float id1)
  {
    SetPoint_4(id0,id1);
  }

  private native void SetPoint_5(float id0[]);
  public void SetPoint(float id0[])
  {
    SetPoint_5(id0);
  }

  private native float[] GetPoint_6();
  public float[] GetPoint()
  {
    return GetPoint_6();
  }

  private native void SetPointIsNormalized_7(boolean id0);
  public void SetPointIsNormalized(boolean id0)
  {
    SetPointIsNormalized_7(id0);
  }

  private native boolean GetPointIsNormalized_8();
  public boolean GetPointIsNormalized()
  {
    return GetPointIsNormalized_8();
  }

  private native void PointIsNormalizedOn_9();
  public void PointIsNormalizedOn()
  {
    PointIsNormalizedOn_9();
  }

  private native void PointIsNormalizedOff_10();
  public void PointIsNormalizedOff()
  {
    PointIsNormalizedOff_10();
  }

  private native void SetHorizontalAlignment_11(int id0);
  public void SetHorizontalAlignment(int id0)
  {
    SetHorizontalAlignment_11(id0);
  }

  private native int GetHorizontalAlignment_12();
  public int GetHorizontalAlignment()
  {
    return GetHorizontalAlignment_12();
  }

  private native void SetVerticalAlignment_13(int id0);
  public void SetVerticalAlignment(int id0)
  {
    SetVerticalAlignment_13(id0);
  }

  private native int GetVerticalAlignment_14();
  public int GetVerticalAlignment()
  {
    return GetVerticalAlignment_14();
  }

  private native void SetPadding_15(int id0);
  public void SetPadding(int id0)
  {
    SetPadding_15(id0);
  }

  private native int GetPadding_16();
  public int GetPadding()
  {
    return GetPadding_16();
  }

  private native void SetSymbolWidth_17(int id0);
  public void SetSymbolWidth(int id0)
  {
    SetSymbolWidth_17(id0);
  }

  private native int GetSymbolWidth_18();
  public int GetSymbolWidth()
  {
    return GetSymbolWidth_18();
  }

  private native void SetLabelSize_19(int id0);
  public void SetLabelSize(int id0)
  {
    SetLabelSize_19(id0);
  }

  private native int GetLabelSize_20();
  public int GetLabelSize()
  {
    return GetLabelSize_20();
  }

  private native void SetInline_21(boolean id0);
  public void SetInline(boolean id0)
  {
    SetInline_21(id0);
  }

  private native boolean GetInline_22();
  public boolean GetInline()
  {
    return GetInline_22();
  }

  private native void SetDragEnabled_23(boolean id0);
  public void SetDragEnabled(boolean id0)
  {
    SetDragEnabled_23(id0);
  }

  private native boolean GetDragEnabled_24();
  public boolean GetDragEnabled()
  {
    return GetDragEnabled_24();
  }

  private native void SetChart_25(vtkChart id0);
  public void SetChart(vtkChart id0)
  {
    SetChart_25(id0);
  }

  private native long GetChart_26();
  public vtkChart GetChart()
  {
    long temp = GetChart_26();

    if (temp == 0) return null;
    return (vtkChart)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_27();
  public void Update()
  {
    Update_27();
  }

  private native boolean Paint_28(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_28(id0);
  }

  private native long GetPen_29();
  public vtkPen GetPen()
  {
    long temp = GetPen_29();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBrush_30();
  public vtkBrush GetBrush()
  {
    long temp = GetBrush_30();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetLabelProperties_31();
  public vtkTextProperty GetLabelProperties()
  {
    long temp = GetLabelProperties_31();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCacheBounds_32(boolean id0);
  public void SetCacheBounds(boolean id0)
  {
    SetCacheBounds_32(id0);
  }

  private native boolean GetCacheBounds_33();
  public boolean GetCacheBounds()
  {
    return GetCacheBounds_33();
  }

  private native void CacheBoundsOn_34();
  public void CacheBoundsOn()
  {
    CacheBoundsOn_34();
  }

  private native void CacheBoundsOff_35();
  public void CacheBoundsOff()
  {
    CacheBoundsOff_35();
  }

  public vtkChartLegend() { super(); }

  public vtkChartLegend(long id) { super(id); }
  public native long   VTKInit();

}
