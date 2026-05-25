// java wrapper for vtkOrientPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOrientPolyData extends vtkPolyDataAlgorithm
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

  private native void SetConsistency_4(boolean id0);
  public void SetConsistency(boolean id0)
  {
    SetConsistency_4(id0);
  }

  private native boolean GetConsistency_5();
  public boolean GetConsistency()
  {
    return GetConsistency_5();
  }

  private native void ConsistencyOn_6();
  public void ConsistencyOn()
  {
    ConsistencyOn_6();
  }

  private native void ConsistencyOff_7();
  public void ConsistencyOff()
  {
    ConsistencyOff_7();
  }

  private native void SetAutoOrientNormals_8(boolean id0);
  public void SetAutoOrientNormals(boolean id0)
  {
    SetAutoOrientNormals_8(id0);
  }

  private native boolean GetAutoOrientNormals_9();
  public boolean GetAutoOrientNormals()
  {
    return GetAutoOrientNormals_9();
  }

  private native void AutoOrientNormalsOn_10();
  public void AutoOrientNormalsOn()
  {
    AutoOrientNormalsOn_10();
  }

  private native void AutoOrientNormalsOff_11();
  public void AutoOrientNormalsOff()
  {
    AutoOrientNormalsOff_11();
  }

  private native void SetNonManifoldTraversal_12(boolean id0);
  public void SetNonManifoldTraversal(boolean id0)
  {
    SetNonManifoldTraversal_12(id0);
  }

  private native boolean GetNonManifoldTraversal_13();
  public boolean GetNonManifoldTraversal()
  {
    return GetNonManifoldTraversal_13();
  }

  private native void NonManifoldTraversalOn_14();
  public void NonManifoldTraversalOn()
  {
    NonManifoldTraversalOn_14();
  }

  private native void NonManifoldTraversalOff_15();
  public void NonManifoldTraversalOff()
  {
    NonManifoldTraversalOff_15();
  }

  private native void SetFlipNormals_16(boolean id0);
  public void SetFlipNormals(boolean id0)
  {
    SetFlipNormals_16(id0);
  }

  private native boolean GetFlipNormals_17();
  public boolean GetFlipNormals()
  {
    return GetFlipNormals_17();
  }

  private native void FlipNormalsOn_18();
  public void FlipNormalsOn()
  {
    FlipNormalsOn_18();
  }

  private native void FlipNormalsOff_19();
  public void FlipNormalsOff()
  {
    FlipNormalsOff_19();
  }

  public vtkOrientPolyData() { super(); }

  public vtkOrientPolyData(long id) { super(id); }
  public native long   VTKInit();

}
