// java wrapper for vtkPointsProjectedHull object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointsProjectedHull extends vtkPoints
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

  private native int RectangleIntersectionX_4(vtkPoints id0);
  public int RectangleIntersectionX(vtkPoints id0)
  {
    return RectangleIntersectionX_4(id0);
  }

  private native int RectangleIntersectionX_5(float id0,float id1,float id2,float id3);
  public int RectangleIntersectionX(float id0,float id1,float id2,float id3)
  {
    return RectangleIntersectionX_5(id0,id1,id2,id3);
  }

  private native int RectangleIntersectionX_6(double id0,double id1,double id2,double id3);
  public int RectangleIntersectionX(double id0,double id1,double id2,double id3)
  {
    return RectangleIntersectionX_6(id0,id1,id2,id3);
  }

  private native int RectangleIntersectionY_7(vtkPoints id0);
  public int RectangleIntersectionY(vtkPoints id0)
  {
    return RectangleIntersectionY_7(id0);
  }

  private native int RectangleIntersectionY_8(float id0,float id1,float id2,float id3);
  public int RectangleIntersectionY(float id0,float id1,float id2,float id3)
  {
    return RectangleIntersectionY_8(id0,id1,id2,id3);
  }

  private native int RectangleIntersectionY_9(double id0,double id1,double id2,double id3);
  public int RectangleIntersectionY(double id0,double id1,double id2,double id3)
  {
    return RectangleIntersectionY_9(id0,id1,id2,id3);
  }

  private native int RectangleIntersectionZ_10(vtkPoints id0);
  public int RectangleIntersectionZ(vtkPoints id0)
  {
    return RectangleIntersectionZ_10(id0);
  }

  private native int RectangleIntersectionZ_11(float id0,float id1,float id2,float id3);
  public int RectangleIntersectionZ(float id0,float id1,float id2,float id3)
  {
    return RectangleIntersectionZ_11(id0,id1,id2,id3);
  }

  private native int RectangleIntersectionZ_12(double id0,double id1,double id2,double id3);
  public int RectangleIntersectionZ(double id0,double id1,double id2,double id3)
  {
    return RectangleIntersectionZ_12(id0,id1,id2,id3);
  }

  private native int GetSizeCCWHullX_13();
  public int GetSizeCCWHullX()
  {
    return GetSizeCCWHullX_13();
  }

  private native int GetSizeCCWHullY_14();
  public int GetSizeCCWHullY()
  {
    return GetSizeCCWHullY_14();
  }

  private native int GetSizeCCWHullZ_15();
  public int GetSizeCCWHullZ()
  {
    return GetSizeCCWHullZ_15();
  }

  private native void Initialize_16();
  public void Initialize()
  {
    Initialize_16();
  }

  private native void Reset_17();
  public void Reset()
  {
    Reset_17();
  }

  private native void Update_18();
  public void Update()
  {
    Update_18();
  }

  public vtkPointsProjectedHull() { super(); }

  public vtkPointsProjectedHull(long id) { super(id); }
  public native long   VTKInit();

}
