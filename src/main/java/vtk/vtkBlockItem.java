// java wrapper for vtkBlockItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBlockItem extends vtkContextItem
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

  private native void SetLabel_5(byte[] id0, int len0);
  public void SetLabel(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabel_5(bytes0, bytes0.length);
  }

  private native byte[] GetLabel_6();
  public String GetLabel()
  {
    return new String(GetLabel_6(), StandardCharsets.UTF_8);
  }

  private native void SetDimensions_7(float id0,float id1,float id2,float id3);
  public void SetDimensions(float id0,float id1,float id2,float id3)
  {
    SetDimensions_7(id0,id1,id2,id3);
  }

  private native void SetDimensions_8(float id0[]);
  public void SetDimensions(float id0[])
  {
    SetDimensions_8(id0);
  }

  private native float[] GetDimensions_9();
  public float[] GetDimensions()
  {
    return GetDimensions_9();
  }

  private native void SetAutoComputeDimensions_10(boolean id0);
  public void SetAutoComputeDimensions(boolean id0)
  {
    SetAutoComputeDimensions_10(id0);
  }

  private native boolean GetAutoComputeDimensions_11();
  public boolean GetAutoComputeDimensions()
  {
    return GetAutoComputeDimensions_11();
  }

  private native void AutoComputeDimensionsOn_12();
  public void AutoComputeDimensionsOn()
  {
    AutoComputeDimensionsOn_12();
  }

  private native void AutoComputeDimensionsOff_13();
  public void AutoComputeDimensionsOff()
  {
    AutoComputeDimensionsOff_13();
  }

  private native void SetHorizontalAlignment_14(int id0);
  public void SetHorizontalAlignment(int id0)
  {
    SetHorizontalAlignment_14(id0);
  }

  private native int GetHorizontalAlignment_15();
  public int GetHorizontalAlignment()
  {
    return GetHorizontalAlignment_15();
  }

  private native void SetVerticalAlignment_16(int id0);
  public void SetVerticalAlignment(int id0)
  {
    SetVerticalAlignment_16(id0);
  }

  private native int GetVerticalAlignment_17();
  public int GetVerticalAlignment()
  {
    return GetVerticalAlignment_17();
  }

  private native void SetPadding_18(int id0,int id1);
  public void SetPadding(int id0,int id1)
  {
    SetPadding_18(id0,id1);
  }

  private native void SetPadding_19(int id0[]);
  public void SetPadding(int id0[])
  {
    SetPadding_19(id0);
  }

  private native int[] GetPadding_20();
  public int[] GetPadding()
  {
    return GetPadding_20();
  }

  private native void SetMargins_21(int id0,int id1);
  public void SetMargins(int id0,int id1)
  {
    SetMargins_21(id0,id1);
  }

  private native void SetMargins_22(int id0[]);
  public void SetMargins(int id0[])
  {
    SetMargins_22(id0);
  }

  private native int[] GetMargins_23();
  public int[] GetMargins()
  {
    return GetMargins_23();
  }

  private native long GetPen_24();
  public vtkPen GetPen()
  {
    long temp = GetPen_24();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBrush_25();
  public vtkBrush GetBrush()
  {
    long temp = GetBrush_25();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMouseOverBrush_26();
  public vtkBrush GetMouseOverBrush()
  {
    long temp = GetMouseOverBrush_26();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetLabelProperties_27(vtkTextProperty id0);
  public void SetLabelProperties(vtkTextProperty id0)
  {
    SetLabelProperties_27(id0);
  }

  private native long GetLabelProperties_28();
  public vtkTextProperty GetLabelProperties()
  {
    long temp = GetLabelProperties_28();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkBlockItem() { super(); }

  public vtkBlockItem(long id) { super(id); }
  public native long   VTKInit();

}
