// java wrapper for vtkColorLegend object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkColorLegend extends vtkChartLegend
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

  private native void GetBounds_4(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_4(id0);
  }

  private native void Update_5();
  public void Update()
  {
    Update_5();
  }

  private native boolean Paint_6(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_6(id0);
  }

  private native void SetTransferFunction_7(vtkScalarsToColors id0);
  public void SetTransferFunction(vtkScalarsToColors id0)
  {
    SetTransferFunction_7(id0);
  }

  private native long GetTransferFunction_8();
  public vtkScalarsToColors GetTransferFunction()
  {
    long temp = GetTransferFunction_8();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPoint_9(float id0,float id1);
  public void SetPoint(float id0,float id1)
  {
    SetPoint_9(id0,id1);
  }

  private native void SetTextureSize_10(float id0,float id1);
  public void SetTextureSize(float id0,float id1)
  {
    SetTextureSize_10(id0,id1);
  }

  private native void SetOrientation_11(int id0);
  public void SetOrientation(int id0)
  {
    SetOrientation_11(id0);
  }

  private native int GetOrientation_12();
  public int GetOrientation()
  {
    return GetOrientation_12();
  }

  private native void SetTitle_13(byte[] id0, int len0);
  public void SetTitle(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTitle_13(bytes0, bytes0.length);
  }

  private native byte[] GetTitle_14();
  public String GetTitle()
  {
    return new String(GetTitle_14(), StandardCharsets.UTF_8);
  }

  private native void SetDrawBorder_15(boolean id0);
  public void SetDrawBorder(boolean id0)
  {
    SetDrawBorder_15(id0);
  }

  private native boolean GetDrawBorder_16();
  public boolean GetDrawBorder()
  {
    return GetDrawBorder_16();
  }

  private native void DrawBorderOn_17();
  public void DrawBorderOn()
  {
    DrawBorderOn_17();
  }

  private native void DrawBorderOff_18();
  public void DrawBorderOff()
  {
    DrawBorderOff_18();
  }

  public vtkColorLegend() { super(); }

  public vtkColorLegend(long id) { super(id); }
  public native long   VTKInit();

}
