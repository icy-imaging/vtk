// java wrapper for vtkExtractCellsAlongPolyLine object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractCellsAlongPolyLine extends vtkUnstructuredGridAlgorithm
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

  private native void SetSourceConnection_4(vtkAlgorithmOutput id0);
  public void SetSourceConnection(vtkAlgorithmOutput id0)
  {
    SetSourceConnection_4(id0);
  }

  private native void SetOutputPointsPrecision_5(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_5(id0);
  }

  private native int GetOutputPointsPrecision_6();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_6();
  }

  public vtkExtractCellsAlongPolyLine() { super(); }

  public vtkExtractCellsAlongPolyLine(long id) { super(id); }
  public native long   VTKInit();

}
