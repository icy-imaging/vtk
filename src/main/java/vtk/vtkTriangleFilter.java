// java wrapper for vtkTriangleFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTriangleFilter extends vtkPolyDataAlgorithm
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

  private native void SetPreservePolys_4(int id0);
  public void SetPreservePolys(int id0)
  {
    SetPreservePolys_4(id0);
  }

  private native int GetPreservePolys_5();
  public int GetPreservePolys()
  {
    return GetPreservePolys_5();
  }

  private native void PreservePolysOn_6();
  public void PreservePolysOn()
  {
    PreservePolysOn_6();
  }

  private native void PreservePolysOff_7();
  public void PreservePolysOff()
  {
    PreservePolysOff_7();
  }

  private native void PassVertsOn_8();
  public void PassVertsOn()
  {
    PassVertsOn_8();
  }

  private native void PassVertsOff_9();
  public void PassVertsOff()
  {
    PassVertsOff_9();
  }

  private native void SetPassVerts_10(int id0);
  public void SetPassVerts(int id0)
  {
    SetPassVerts_10(id0);
  }

  private native int GetPassVerts_11();
  public int GetPassVerts()
  {
    return GetPassVerts_11();
  }

  private native void PassLinesOn_12();
  public void PassLinesOn()
  {
    PassLinesOn_12();
  }

  private native void PassLinesOff_13();
  public void PassLinesOff()
  {
    PassLinesOff_13();
  }

  private native void SetPassLines_14(int id0);
  public void SetPassLines(int id0)
  {
    SetPassLines_14(id0);
  }

  private native int GetPassLines_15();
  public int GetPassLines()
  {
    return GetPassLines_15();
  }

  private native void SetTolerance_16(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_16(id0);
  }

  private native double GetTolerance_17();
  public double GetTolerance()
  {
    return GetTolerance_17();
  }

  public vtkTriangleFilter() { super(); }

  public vtkTriangleFilter(long id) { super(id); }
  public native long   VTKInit();

}
