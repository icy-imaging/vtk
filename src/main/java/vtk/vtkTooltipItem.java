// java wrapper for vtkTooltipItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTooltipItem extends vtkContextItem
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

  private native void SetPosition_4(float id0,float id1);
  public void SetPosition(float id0,float id1)
  {
    SetPosition_4(id0,id1);
  }

  private native void SetPosition_5(float id0[]);
  public void SetPosition(float id0[])
  {
    SetPosition_5(id0);
  }

  private native float[] GetPosition_6();
  public float[] GetPosition()
  {
    return GetPosition_6();
  }

  private native void SetText_7(byte[] id0, int len0);
  public void SetText(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetText_7(bytes0, bytes0.length);
  }

  private native byte[] GetText_8();
  public String GetText()
  {
    return new String(GetText_8(), StandardCharsets.UTF_8);
  }

  private native long GetPen_9();
  public vtkPen GetPen()
  {
    long temp = GetPen_9();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBrush_10();
  public vtkBrush GetBrush()
  {
    long temp = GetBrush_10();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextProperties_11();
  public vtkTextProperty GetTextProperties()
  {
    long temp = GetTextProperties_11();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_12();
  public void Update()
  {
    Update_12();
  }

  private native boolean Paint_13(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_13(id0);
  }

  public vtkTooltipItem() { super(); }

  public vtkTooltipItem(long id) { super(id); }
  public native long   VTKInit();

}
