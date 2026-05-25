// java wrapper for vtkContextClip object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContextClip extends vtkAbstractContextItem
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

  private native void Update_4();
  public void Update()
  {
    Update_4();
  }

  private native boolean Paint_5(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_5(id0);
  }

  private native void SetClip_6(float id0,float id1,float id2,float id3);
  public void SetClip(float id0,float id1,float id2,float id3)
  {
    SetClip_6(id0,id1,id2,id3);
  }

  private native void GetRect_7(float id0[]);
  public void GetRect(float id0[])
  {
    GetRect_7(id0);
  }

  private native float GetX_8();
  public float GetX()
  {
    return GetX_8();
  }

  private native float GetY_9();
  public float GetY()
  {
    return GetY_9();
  }

  private native float GetWidth_10();
  public float GetWidth()
  {
    return GetWidth_10();
  }

  private native float GetHeight_11();
  public float GetHeight()
  {
    return GetHeight_11();
  }

  public vtkContextClip() { super(); }

  public vtkContextClip(long id) { super(id); }
  public native long   VTKInit();

}
