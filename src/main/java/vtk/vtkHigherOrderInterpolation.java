// java wrapper for vtkHigherOrderInterpolation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHigherOrderInterpolation extends vtkObject
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

  private native int GetVaryingParameterOfHexEdge_4(int id0);
  public int GetVaryingParameterOfHexEdge(int id0)
  {
    return GetVaryingParameterOfHexEdge_4(id0);
  }

  private native int[] GetPointIndicesBoundingHexFace_5(int id0);
  public int[] GetPointIndicesBoundingHexFace(int id0)
  {
    return GetPointIndicesBoundingHexFace_5(id0);
  }

  private native int[] GetEdgeIndicesBoundingHexFace_6(int id0);
  public int[] GetEdgeIndicesBoundingHexFace(int id0)
  {
    return GetEdgeIndicesBoundingHexFace_6(id0);
  }

  private native int GetFixedParameterOfHexFace_7(int id0);
  public int GetFixedParameterOfHexFace(int id0)
  {
    return GetFixedParameterOfHexFace_7(id0);
  }

  private native int GetVaryingParameterOfWedgeEdge_8(int id0);
  public int GetVaryingParameterOfWedgeEdge(int id0)
  {
    return GetVaryingParameterOfWedgeEdge_8(id0);
  }

  private native int[] GetPointIndicesBoundingWedgeFace_9(int id0);
  public int[] GetPointIndicesBoundingWedgeFace(int id0)
  {
    return GetPointIndicesBoundingWedgeFace_9(id0);
  }

  private native int[] GetEdgeIndicesBoundingWedgeFace_10(int id0);
  public int[] GetEdgeIndicesBoundingWedgeFace(int id0)
  {
    return GetEdgeIndicesBoundingWedgeFace_10(id0);
  }

  private native int GetFixedParameterOfWedgeFace_11(int id0);
  public int GetFixedParameterOfWedgeFace(int id0)
  {
    return GetFixedParameterOfWedgeFace_11(id0);
  }

  public vtkHigherOrderInterpolation() { super(); }

  public vtkHigherOrderInterpolation(long id) { super(id); }

}
