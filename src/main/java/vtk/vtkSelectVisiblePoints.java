// java wrapper for vtkSelectVisiblePoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSelectVisiblePoints extends vtkPolyDataAlgorithm
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

  private native void SetRenderer_4(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_4(id0);
  }

  private native long GetRenderer_5();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_5();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSelectionWindow_6(int id0);
  public void SetSelectionWindow(int id0)
  {
    SetSelectionWindow_6(id0);
  }

  private native int GetSelectionWindow_7();
  public int GetSelectionWindow()
  {
    return GetSelectionWindow_7();
  }

  private native void SelectionWindowOn_8();
  public void SelectionWindowOn()
  {
    SelectionWindowOn_8();
  }

  private native void SelectionWindowOff_9();
  public void SelectionWindowOff()
  {
    SelectionWindowOff_9();
  }

  private native void SetSelection_10(int id0,int id1,int id2,int id3);
  public void SetSelection(int id0,int id1,int id2,int id3)
  {
    SetSelection_10(id0,id1,id2,id3);
  }

  private native void SetSelection_11(int id0[]);
  public void SetSelection(int id0[])
  {
    SetSelection_11(id0);
  }

  private native int[] GetSelection_12();
  public int[] GetSelection()
  {
    return GetSelection_12();
  }

  private native void SetSelectInvisible_13(int id0);
  public void SetSelectInvisible(int id0)
  {
    SetSelectInvisible_13(id0);
  }

  private native int GetSelectInvisible_14();
  public int GetSelectInvisible()
  {
    return GetSelectInvisible_14();
  }

  private native void SelectInvisibleOn_15();
  public void SelectInvisibleOn()
  {
    SelectInvisibleOn_15();
  }

  private native void SelectInvisibleOff_16();
  public void SelectInvisibleOff()
  {
    SelectInvisibleOff_16();
  }

  private native void SetTolerance_17(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_17(id0);
  }

  private native double GetToleranceMinValue_18();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_18();
  }

  private native double GetToleranceMaxValue_19();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_19();
  }

  private native double GetTolerance_20();
  public double GetTolerance()
  {
    return GetTolerance_20();
  }

  private native void SetToleranceWorld_21(double id0);
  public void SetToleranceWorld(double id0)
  {
    SetToleranceWorld_21(id0);
  }

  private native double GetToleranceWorldMinValue_22();
  public double GetToleranceWorldMinValue()
  {
    return GetToleranceWorldMinValue_22();
  }

  private native double GetToleranceWorldMaxValue_23();
  public double GetToleranceWorldMaxValue()
  {
    return GetToleranceWorldMaxValue_23();
  }

  private native double GetToleranceWorld_24();
  public double GetToleranceWorld()
  {
    return GetToleranceWorld_24();
  }

  private native long GetMTime_25();
  public long GetMTime()
  {
    return GetMTime_25();
  }

  public vtkSelectVisiblePoints() { super(); }

  public vtkSelectVisiblePoints(long id) { super(id); }
  public native long   VTKInit();

}
