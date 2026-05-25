// java wrapper for vtkTessellatedBoxSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTessellatedBoxSource extends vtkPolyDataAlgorithm
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

  private native void SetBounds_4(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_4(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_5(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_5(id0);
  }

  private native double[] GetBounds_6();
  public double[] GetBounds()
  {
    return GetBounds_6();
  }

  private native void SetLevel_7(int id0);
  public void SetLevel(int id0)
  {
    SetLevel_7(id0);
  }

  private native int GetLevel_8();
  public int GetLevel()
  {
    return GetLevel_8();
  }

  private native void SetDuplicateSharedPoints_9(int id0);
  public void SetDuplicateSharedPoints(int id0)
  {
    SetDuplicateSharedPoints_9(id0);
  }

  private native int GetDuplicateSharedPoints_10();
  public int GetDuplicateSharedPoints()
  {
    return GetDuplicateSharedPoints_10();
  }

  private native void DuplicateSharedPointsOn_11();
  public void DuplicateSharedPointsOn()
  {
    DuplicateSharedPointsOn_11();
  }

  private native void DuplicateSharedPointsOff_12();
  public void DuplicateSharedPointsOff()
  {
    DuplicateSharedPointsOff_12();
  }

  private native void SetQuads_13(int id0);
  public void SetQuads(int id0)
  {
    SetQuads_13(id0);
  }

  private native int GetQuads_14();
  public int GetQuads()
  {
    return GetQuads_14();
  }

  private native void QuadsOn_15();
  public void QuadsOn()
  {
    QuadsOn_15();
  }

  private native void QuadsOff_16();
  public void QuadsOff()
  {
    QuadsOff_16();
  }

  private native void SetOutputPointsPrecision_17(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_17(id0);
  }

  private native int GetOutputPointsPrecision_18();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_18();
  }

  public vtkTessellatedBoxSource() { super(); }

  public vtkTessellatedBoxSource(long id) { super(id); }
  public native long   VTKInit();

}
