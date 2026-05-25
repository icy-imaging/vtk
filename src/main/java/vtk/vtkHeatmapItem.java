// java wrapper for vtkHeatmapItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHeatmapItem extends vtkContextItem
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

  private native void SetTable_4(vtkTable id0);
  public void SetTable(vtkTable id0)
  {
    SetTable_4(id0);
  }

  private native long GetTable_5();
  public vtkTable GetTable()
  {
    long temp = GetTable_5();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetRowNames_6();
  public vtkStringArray GetRowNames()
  {
    long temp = GetRowNames_6();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetNameColumn_7();
  public String GetNameColumn()
  {
    return new String(GetNameColumn_7(), StandardCharsets.UTF_8);
  }

  private native void SetNameColumn_8(byte[] id0, int len0);
  public void SetNameColumn(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNameColumn_8(bytes0, bytes0.length);
  }

  private native void SetOrientation_9(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_9(id0);
  }

  private native int GetOrientation_10();
  public int GetOrientation()
  {
    return GetOrientation_10();
  }

  private native double GetTextAngleForOrientation_11(int id0);
  public double GetTextAngleForOrientation(int id0)
  {
    return GetTextAngleForOrientation_11(id0);
  }

  private native void SetPosition_12(float id0,float id1);
  public void SetPosition(float id0,float id1)
  {
    SetPosition_12(id0,id1);
  }

  private native void SetPosition_13(float id0[]);
  public void SetPosition(float id0[])
  {
    SetPosition_13(id0);
  }

  private native float[] GetPosition_14();
  public float[] GetPosition()
  {
    return GetPosition_14();
  }

  private native double GetCellHeight_15();
  public double GetCellHeight()
  {
    return GetCellHeight_15();
  }

  private native void SetCellHeight_16(double id0);
  public void SetCellHeight(double id0)
  {
    SetCellHeight_16(id0);
  }

  private native double GetCellWidth_17();
  public double GetCellWidth()
  {
    return GetCellWidth_17();
  }

  private native void SetCellWidth_18(double id0);
  public void SetCellWidth(double id0)
  {
    SetCellWidth_18(id0);
  }

  private native void GetBounds_19(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_19(id0);
  }

  private native void MarkRowAsBlank_20(byte[] id0, int len0);
  public void MarkRowAsBlank(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    MarkRowAsBlank_20(bytes0, bytes0.length);
  }

  private native boolean Paint_21(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_21(id0);
  }

  private native float GetRowLabelWidth_22();
  public float GetRowLabelWidth()
  {
    return GetRowLabelWidth_22();
  }

  private native float GetColumnLabelWidth_23();
  public float GetColumnLabelWidth()
  {
    return GetColumnLabelWidth_23();
  }

  public vtkHeatmapItem() { super(); }

  public vtkHeatmapItem(long id) { super(id); }
  public native long   VTKInit();

}
