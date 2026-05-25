// java wrapper for vtkAdjacencyMatrixToEdgeTable object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAdjacencyMatrixToEdgeTable extends vtkTableAlgorithm
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

  private native long GetSourceDimension_4();
  public long GetSourceDimension()
  {
    return GetSourceDimension_4();
  }

  private native void SetSourceDimension_5(long id0);
  public void SetSourceDimension(long id0)
  {
    SetSourceDimension_5(id0);
  }

  private native byte[] GetValueArrayName_6();
  public String GetValueArrayName()
  {
    return new String(GetValueArrayName_6(), StandardCharsets.UTF_8);
  }

  private native void SetValueArrayName_7(byte[] id0, int len0);
  public void SetValueArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetValueArrayName_7(bytes0, bytes0.length);
  }

  private native long GetMinimumCount_8();
  public long GetMinimumCount()
  {
    return GetMinimumCount_8();
  }

  private native void SetMinimumCount_9(long id0);
  public void SetMinimumCount(long id0)
  {
    SetMinimumCount_9(id0);
  }

  private native double GetMinimumThreshold_10();
  public double GetMinimumThreshold()
  {
    return GetMinimumThreshold_10();
  }

  private native void SetMinimumThreshold_11(double id0);
  public void SetMinimumThreshold(double id0)
  {
    SetMinimumThreshold_11(id0);
  }

  public vtkAdjacencyMatrixToEdgeTable() { super(); }

  public vtkAdjacencyMatrixToEdgeTable(long id) { super(id); }
  public native long   VTKInit();

}
